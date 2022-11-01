let descuento = 0;

let precio = Number(prompt("Introduce el precio: "));
let cupon = prompt("Introduce tu cupón: ");
cupon = cupon.toLowerCase();

if (isNaN(precio)) {
  alert("Introduce un precio correcto.");
} else {
  switch (cupon) {
    case "bronce":
      descuento = 0.05;
      break;
    case "plata":
      descuento = 0.1;
      break;
    case "oro":
      descuento = 0.2;
      break;
    case "platino":
      descuento = 0.25;
      break;

    default:
      alert("El cupon no es válido.");
      break;
  }

  document.write("Tu precio sin descuento es: " + precio + "<br>");
  document.write(
    "Tu precio con descuento es: " + (precio - precio * descuento)
  );
}


