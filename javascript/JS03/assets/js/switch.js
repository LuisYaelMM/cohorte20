/* Switch - Case */
//evalúa opciones

let dia = 50;
switch (dia) {
  case 1:
    document.write("Lunes");
    break;
  case 2:
    document.write("Martes");
    break;
  case 3:
    document.write("Miércoles");
    break;
  case 4:
    document.write("Jueves");
    break;
  case 5:
    document.write("Viernes");
    break;
  case 6:
    document.write("Sábado");
    break;
  case 7:
    document.write("Domingo");
    break;

  default:
    document.write("No es un día valido");
    break;
}

/* String
""
''
`` -literal strings- plantilla literales */
let nombre = "Luis";
console.log(`Hola soy ${nombre}`);

let edad = 15;
let mensaje = edad >= 18 ? "Eres mayor de edad" : "Tas chiquito";
console.log(mensaje);

console.log(
  `Yo soy Luis y ${edad >= 18 ? "soy mayor de edad" : "soy menor de edad"}`
);
