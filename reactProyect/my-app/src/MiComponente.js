import React from "react"

const MiComponente=()=>{
    let nombre="pedroVar";
    let web="generation.org";
    let usuario={
        nombre: "JuanHer",
        apellido: "Robles"
    }
    return(
   
    <header>
        <h1>Componente creado</h1>
    <p>
        Este es mi primer componente
    </p>
    <ul>
        <li>Nombre: 
            <strong>{usuario.nombre}</strong>            
        </li>
        <li>Web.{web}</li>
    </ul>
    </header>
    );
    
}

    /* 
    Esto es un comentario en react
    */

export default MiComponente;