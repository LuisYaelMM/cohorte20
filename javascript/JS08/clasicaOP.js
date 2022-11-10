class operacionesAritmeticas {
  numero0 = 0;
  numero1 = 0;
  constructor(valor0, valor1) {
    this.numero0 = valor0;
    this.numero1 = valor1;
  }
  sumar(a, b) {
    return a + b;
  }

  set numero0(num0) {
    this.numero0 = num0;
  }
  set numero1(num1) {
    this.numero1 = num1;
  }

  get numero0() {
    return this.numero0;
  }
  get numero1() {
    return this.numero1;
  }
}

let obj1 = new operacionesAritmeticas(8, 6);
console.log(obj1.numero0);
console.log(obj1.numero1);
console.log("obj1:" + obj1.sumar(obj1.numero0, obj1.numero1));

let obj2 = new operacionesAritmeticas();
obj2.numero0 = 9;
obj2.numero1 = 54;
console.log(obj2.numero0);
console.log(obj2.sumar(obj2.numero0, obj2.numero1));
