import React from 'react'
import  PropTypes  from 'prop-types'

export const TercerComponente = (props) => {
  return (
    <div>
        <h1>TercerComponente</h1>
        <h2>Comunicacion entre componentes</h2>
        <ul>
            <li>{props.nombre}</li>
            <li>{props.apellido}</li>
            <li>{props.ficha.grupo}</li>
            <li>{props.ficha.estado}</li>
            <li>{props.ficha.altura}</li>
            <li>{props.ficha.alergias}</li>
        </ul>
    </div>

    
  )
}
TercerComponente.propTypes={
    nombre : PropTypes.string,
}