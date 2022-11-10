let constructor = function () {
  //declarando el objeto
  let valor0 = 0;
  let valor1 = 0;
  let persona = {
    nombre: "Pedro",
    apellido: "Lara",
    suma: function (a, b) {
      return a + b;
    },
    get nombre1() {
      return this._nombre;
    },
    set nombre1(nombre0) {
      this._nombre = nombre0;
    },
  };
  return persona;
};

let p1 = new constructor();
p1.nombre = "Carlos";
console.log(p1.nombre);
