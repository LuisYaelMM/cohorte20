let arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

let contador = 0;
/* while (contador < 10) {
  console.log(contador);
  contador++;
} */

/* do {
  contador++;
  console.log(contador);
} while (contador <= 10); */

console.log(contador);

console.log(arr[1][1]);
/* let suba = [1, 2, 3];
let subb = [4, 5, 6];
let subc = [7, 8, 9];
let arregloS = [suba, subb, subc]; */
/* let fila = 0;
do {
  for (let columna = 0; columna <= 2; columna++) {
    console.log(arr[fila][columna]);
  }
  fila++;
  console.log("-------");
} while (fila <= 0); */

let matriz1 = [
  [2, 2, 2],
  [1, 3, 4],
  [6, 1, 5],
];

let matriz2 = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

let matrizR = [
    [],[],[],
];

for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    matrizR[i][j] = matriz1[i][j] * matriz2[j][i];
  }
}

console.log(matrizR);
