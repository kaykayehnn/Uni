using System;

abstract class BoilerState
{
    protected BoilerState() { }

    protected bool IsNightTime { get; set; }
    protected bool IsWaterCold { get; set; }

    protected BoilerState(BoilerState state)
    {
        this.IsNightTime = state.IsNightTime;
        this.IsWaterCold = state.IsWaterCold;
    }

    public void SetTime(Context context, int hours)
    {
        this.IsNightTime = hours >= 22 || hours < 6;
        this.TransitionStates(context);
    }

    public void SetWaterTemperature(Context context, int degrees)
    {
        this.IsWaterCold = degrees < 25;
        this.TransitionStates(context);
    }

    protected abstract void TransitionStates(Context context);
}

class BoilerStateOff : BoilerState
{
    public BoilerStateOff() : base() { }
    public BoilerStateOff(BoilerState state) : base(state) { }

    protected override void TransitionStates(Context context)
    {
        if (this.IsNightTime && this.IsWaterCold)
        {
            context.State = new BoilerStateOn(context.State);
        }
    }
}

class BoilerStateOn : BoilerState
{
    public BoilerStateOn(BoilerState state) : base(state) { }

    protected override void TransitionStates(Context context)
    {
        if (!this.IsNightTime || !this.IsWaterCold)
        {
            context.State = new BoilerStateOff(context.State);
        }
    }
}

class Context
{
    private BoilerState _state;

    public Context(BoilerState state)
    {
        this.State = state;
    }

    public BoilerState State
    {
        get { return _state; }
        set
        {
            _state = value;
            Console.WriteLine("State: " +
              _state.GetType().Name);
        }
    }

    public void SetTime(int hours)
    {
        _state.SetTime(this, hours);
    }

    public void SetWaterTemperature(int degrees)
    {
        _state.SetWaterTemperature(this, degrees);
    }
}

class MainApp
{
    static void Main()
    {
        // Setup context in a state
        Context c = new Context(new BoilerStateOff());

        // At first the boiler is off

        c.SetTime(22);
        c.SetWaterTemperature(20);
        // The boiler is now turned on

        c.SetTime(6);
        // The boiler turns off

        c.SetTime(22);
        // The boiler turns on again

        c.SetWaterTemperature(30);
        // The boiler turns off now that the water is hot

        Console.ReadKey();
    }
}
