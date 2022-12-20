fibonacci();

function fibonacci() {
  let numero;
  do {
    numero = Number(
      prompt(
        "Introduce la cantidad de números de la serie de Fibonacci a mostrar:"
      )
    );
    if (isNaN(numero)) {
      console.log("Por favor introduzca un número.");
    } else {
      let serie = [0, 1];
      for (let i = 2; i < numero; i++) {
        serie.push(serie[i - 1] + serie[i - 2]);
      }
      let serieImpresa = "";
      serie.forEach((element) => {
        serieImpresa += element + ", ";
      });
      serieImpresa = serieImpresa.slice(0, -2);
      serieImpresa += ".";
      console.log(serieImpresa);
    }
  } while (isNaN(numero));
}
