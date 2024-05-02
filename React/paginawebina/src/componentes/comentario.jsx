import React  from "react";
import "../estilos/comentario.css"

function Comentario(props){
    return(
        <div className="contedor-comentario">
            <img className="imagen-comentario" src={require(`../imagenes/${props.imagen}.png`)}alt="foto" />
            <div className="contenedor-texto-comentario">
                <p className="nombre-comentario">{props.nombre} en {props.provincia}</p>
                <p className="cargo-comentario">{props.cargo} en {props.empresa}</p>
                <p className="texto-comentario"> {props.comentario}</p>
            </div>
        </div>

    ); 
}

export default Comentario;