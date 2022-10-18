import React from "react";

import imagemEdit from "../assets/imagens/edit-icon.png";
import imagemDelete from "../assets/imagens/delete-icon.png";

function CardMusica(props){
    return(
        <>
        <div className="card-music">
                        <div className="icons">
                            <img src={imagemEdit} alt="" />
                            <img src={imagemDelete} alt="" />
                        </div>
                        <div className="info-music">
                            <p>
                                <strong className="card-title">música: </strong>
                                <input className="input-music-enable" type="text" defaultValue={props.titulo} />
                            </p>
                            <p>
                                <strong className="card-title">artista: </strong>
                                <input className="input-music-enable" type="text" defaultValue="Teste" />
                            </p>
                            <p>
                                <strong className="card-title">gênero: </strong>
                                <input className="input-music-enable" type="text" defaultValue="Teste" />
                            </p>
                            <p>
                                <strong className="card-title">ano: </strong>
                                <input className="input-music-enable" type="text" defaultValue="Teste" />
                            </p>
                            <button className="btn-salvar-enable">Salvar</button>
                        </div>
                    </div>
        </>
    );
}

export default CardMusica;