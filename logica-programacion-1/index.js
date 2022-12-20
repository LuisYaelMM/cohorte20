let num1 = parseInt(prompt("Introduce el primer número: "));
let num2 = parseInt(prompt("Introduce el segundo número: "));
let num3 = parseInt(prompt("Introduce el tercer número: "));

ordenar(num1, num2, num3);

function ordenar(x, y, z) {
  if (x == y && y == z) {
    console.log("Los tres números son iguales.");
  } else {
    if (x > y && x > z) {
      if (y > z) {
        imprimir(x, y, z);
      } else {
        imprimir(x, z, y);
      }
    } else if (y > x && y > z) {
      if (x > z) {
        imprimir(y, x, z);
      } else {
        imprimir(y, z, x);
      }
    } else if (z > x && z > y) {
      if (x > y) {
        imprimir(z, x, y);
      } else {
        imprimir(z, y, x);
      }
    }
  }
}

function imprimir(num1, num2, num3) {
  console.log(
    "El orden de los números de mayor a menor es: " +
      num1 +
      "," +
      num2 +
      "," +
      num3
  );
}
