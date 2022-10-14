//let miVariable = prompt("¿Cuál es tu nombre?: ");

function saludoPer(miVariable = "ss") {
  alert(miVariable);
}

function suma() {
  //let num1 = parseInt(prompt("Dame el primer número", 0));
  //let num2 = parseInt(prompt("Dame el segundo número"));
  let num1 = 2;
  let num2 = 6;
  return num1 + num2;
}

function resta() {
  let num1 = 10;
  let num2 = 4;
  return num1 - num2;
}

function multiplicacion() {
  let num1 = 10;
  let num2 = 4;
  return num1 * num2;
}

function division() {
  let num1 = 10;
  let num2 = 4;
  if (num2 != 0) {
    return num1 / num2;
  }
}

function resto() {
  let num1 = 10;
  let num2 = 4;
  return num1 % num2;
}

function adicionales() {
  let num1 = 10;
  num1 += num1;
  return num1;
}

function decremento() {
  let num1 = 10;
  return --num1;
}

function logico() {
  let valido = 2;
  let valido1 = 3;
  if (valido >= valido1) {
    console.log("El mayor es " + valido);
  } else {
    console.log("El mayor es " + valido1);
  }
  console.log("El valor booleano es: " + valido);
}

function edad() {
  let miEdad = 8;
  if (miEdad >= 18) {
    console.log("Eres mayor de edad");
  } else {
    console.log("Eres menor de edad");
  }
}

function conjuncion() {
  let valor1 = false;
  let valor2 = true;
  if (valor1 && valor2) {
    console.log("El valor 1 y el valor 2 son verdaderos");
  } else {
    console.log("Un valor es falso");
  }
}

function disyuncion() {
  let valor1 = false;
  let valor2 = true;
  if (valor1 || valor2) {
    console.log("El operador or es verdadero");
  } else {
    console.log("El operador or es falso");
  }
}

function negacion() {
  let valor1 = false;
  if (!(!valor1)) {
    console.log("El valor es " + valor1);
  }else{
    console.log("El valor negado es "+ valor1);
  }
}

//saludoPer(miVariable);
//alert(suma());
console.log("El resultado de la suma es: " + suma());
console.log("El resultado de la resta es: " + resta());
console.log("El resultado de la multiplicacion es: " + multiplicacion());
console.log("El resultado de la division es: " + division());
console.log("El residuo de la operación es: " + resto());
console.log("El numero adicional es: " + adicionales());
console.log("El numero decrementado es: " + decremento());
logico();
edad();
conjuncion();
disyuncion();
negacion();
