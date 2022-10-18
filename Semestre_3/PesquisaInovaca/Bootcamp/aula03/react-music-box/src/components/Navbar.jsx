import React from "react";

import imagemLogo from '../assets/imagens/logo-verde.png';
import imagemAvatar from '../assets/imagens/avatar.png';

function Navbar() {
    return(
        <>
           <nav>
                <div className="container">
                    <img src={imagemLogo} alt="Logo" className="logo" />
                    <img src={imagemAvatar} alt="Avatar" className="avatar" />
                </div>
            </nav>
        </>
    );    
}

export default Navbar;