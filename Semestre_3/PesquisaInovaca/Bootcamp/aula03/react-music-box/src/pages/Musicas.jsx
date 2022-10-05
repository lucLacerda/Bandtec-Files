import { useEffect, useState } from "react";

import api from "../api"; // importando a instância do Axios de "api.js"

import Navbar from "../components/Navbar";
import CardMusica from "../components/CardMusica";

function Musicas() {

    const [musicas, setMusicas] = useState([]); // criando estado de vetor para uma lista de músicas  

    const [estadoParaObservar, setEstadoParaObservar] = useState(0);

    useEffect(() => {alert("Estado alterado")})

    function listar() {
        console.log("Requisição está sendo feita: ");

        api.get()                               // invocando o método "get" do axios utilizando a URL base instanciada em "api.js"
            .then(function (respostaObtida) {       // método get responde uma Promise que será resolvida, e quando obtiver uma resposta, cairá no "then" recebendo a resposta como parâmetro
                console.log(respostaObtida.data);   // exibindo o atributo "data", que possui o vetor de dados do objeto de resposta que foi recebido
                setMusicas(respostaObtida.data);    // utilizando o setter para alterar o valor do estado (useState) de "musicas"        
            })
            .catch((errorOcorrido) => {             // caso a requisição falhe, o "catch" pegará o erro, recebendo como parâmetro de uma função
                console.log(errorOcorrido)          // exibindo o erro que ocorreu na requisição
            });
    }


    return (
        <>
        <Navbar />
            <div className="container">
                <div className="filter">
                    <button onClick={listar} className="btn">Adicionar</button>
                </div>
            </div>

            <div className="container">
                <div className="music-boxes">
                    <CardMusica titulo="In the end" artista="Linkin Park" genero="Rock" ano="2000" />

                    {
                        musicas.map((musica, index) => {
                            return(
                                <CardMusica key={index} 
                                titulo={musica.titulo}
                                artista={musica.artista}
                                genero={musica.genero}
                                ano={musica.ano}
                                />
                            )
                        })
                    }
                </div>
            </div>
        </>
    );
}

export default Musicas;