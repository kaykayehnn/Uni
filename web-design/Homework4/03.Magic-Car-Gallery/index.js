let links = document.querySelectorAll(".link");

let iframe = document.getElementById("car-iframe");

links.forEach((link) => {
  let carId = link.dataset.car;
  link.addEventListener("click", (e) => {
    console.log(carId);
    iframe.src = `${carId}.html`;
  });
});
