import imagemEdit from "../assets/imagens/edit-icon.png" // importando recurso de imagem de edit (lápis) como uma variável
import imagemDelete from "../assets/imagens/delete-icon.png" // importando recurso de imagem de delete (lixeira) como uma variável
import imgCapaPadrao from "../assets/imagens/capa.png"
import { useState } from "react"
import api from "../api"

function CardMusica(props) {

    const imagem = {
        backgroundImage: `url(${props.imagem ? props.imagem : imgCapaPadrao})`
    }

    const [editando, setEditando] = useState(false);

    const [titulo, setTitulo] = useState(props.titulo);
    const [artista, setArtista] = useState(props.artista);
    const [genero, setGenero] = useState(props.genero);
    const [ano, setAno] = useState(props.ano);

    function atualizarMusica() {
        const musicaAtual = {
            titulo,
            artista,
            genero,
            ano,
        }

        api.put(`/${props.id}`, musicaAtual)
        .then(res => {console.log(res)})

        setEditando(false);
    }

    return (
        <>
            {/* ao utilizarmos {imagemEdit} ou {imagemDelete} no "src" de uma imagem, o recurso que importamos e armazenamos na variável será renderizado */}
            <div style={imagem} className="card-music">
                <div className="icons">
                    <img onClick={() => setEditando(true)} src={imagemEdit} alt="" />
                    <img src={imagemDelete} alt="" />
                </div>
                <div className="info-music">
                    <p>
                        <strong className="card-title">música: </strong>
                        <input disabled={!editando}
                            className={
                                !editando
                                    ? "input-music-enable"
                                    : "input-music-disabled"}
                            type="text"
                            defaultValue={props.titulo}
                            onInput={(evento) => setTitulo(evento.target.value)}
                        />
                    </p>
                    <p>
                        <strong className="card-title">artista: </strong>
                        <input disabled={!editando}
                            className={
                                !editando
                                    ? "input-music-enable"
                                    : "input-music-disabled"}
                            type="text"
                            defaultValue={props.artista}
                            onInput={(evento) => setArtista(evento.target.value)}
                        />
                    </p>
                    <p>
                        <strong className="card-title">gênero: </strong>
                        <input disabled={!editando}
                            className={
                                !editando
                                    ? "input-music-enable"
                                    : "input-music-disabled"}
                            type="text"
                            defaultValue={props.genero}
                            onInput={(evento) => setGenero(evento.target.value)}
                        />
                    </p>
                    <p>
                        <strong className="card-title">ano: </strong>
                        <input disabled={!editando}
                            className={
                                !editando
                                    ? "input-music-enable"
                                    : "input-music-disabled"}
                            type="text"
                            defaultValue={props.ano}
                            onInput={(evento) => setAno(evento.target.value)}
                        />
                    </p>
                    <button onClick={atualizarMusica} className={editando ? "btn-salvar-enable" : "btn-salvar-disabled"}>Salvar</button>
                </div>
            </div>
            {/* 
        acima, estamos utilizando as props recebidas como valor da input;
        precisamos utilizar o atributo "defaultValue", pois o "value" é um valor apenas para leitura, e não irá alterar o valor do campo ao digitar;
    */}

        </>
    );
}

export default CardMusica;