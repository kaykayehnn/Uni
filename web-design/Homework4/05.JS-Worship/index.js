let canvas = document.getElementById("canvas");
let ctx = canvas.getContext("2d");

ctx.font = "35px serif";
ctx.fillText("I love JavaScript", 50, 50);

ctx.strokeStyle = "red";
ctx.lineWidth = 5;

ctx.setLineDash([2]);
ctx.strokeRect(0, 0, 400, 400);

let img = document.getElementById("js-logo");

img.onload = () => {
  ctx.drawImage(img, 100, 100);
};
