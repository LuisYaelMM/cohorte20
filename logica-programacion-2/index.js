convertirGrados();

function convertirGrados() {
  let celsius;
  do {
    celsius = parseInt(prompt("Introduce los grados Celsius"));
    if (isNaN(celsius)) {
      console.log("Por favor introduzca un número.");
    } else {
      console.log("Grados Kelvin: ", (celsius + 273.15));
      console.log("Grados Fahrenheit: ", celsius * 1.8 + 32);
    }
  } while (isNaN(celsius));
}
