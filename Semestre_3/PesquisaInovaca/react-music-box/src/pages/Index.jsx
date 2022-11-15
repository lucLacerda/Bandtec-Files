import React from "react";
import Navbar from "../components/Navbar";

import imgOndaRosa from "../assets/imagens/sound-waves-pink.png"

function Index() {
    return (
        <>
            <Navbar />
            <div className="container index">
                <div className="index-content">
                    <div className="box-text-index">
                        <div className="info-index">
                            <p className="display">a música certa para o seu mood</p>
                            <p className="subtitle">organize suas músicas preferidas por categorias e aproveite cada batida</p>
                        </div>
                        <div className="img-index"></div>
                        <button className="btn">começar</button>
                    </div>
                    <img src={imgOndaRosa} alt="" className="index-img" />
                </div>
            </div>
        </>)
}

export default Index;