factorial();

function factorial() {
  let numero;
  do {
    numero = Number(
      prompt("Introduce el número al que se calculara su factorial")
    );
    if (isNaN(numero)) {
      console.log("Por favor introduzca un número.");
    } else {
      let resultado = 1;
      for (let i = 1; i <= numero; i++) {
        resultado *= i;
      }
      console.log("El factorial del número introducido es: ", resultado);
    }
  } while (isNaN(numero));
}
