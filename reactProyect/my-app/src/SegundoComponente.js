import React from "react";

export const SegundoComponente = () => {
  const libros = ["Harry Potter", "Hobbit", "Principito"];
  //const libros = [];
  return (
    <div>
      <h1>SegundoComponente</h1>
      <h2>Lista de libros</h2>
      {libros.length>=1 ? 
      <ul>
        {
            libros.map((libro,indice)=>{
                return <li key={indice}>{libro}</li>
            })
        }
    </ul>
    :(<p>*****No hay libros*****</p>)}
    </div>
   
  );
};
