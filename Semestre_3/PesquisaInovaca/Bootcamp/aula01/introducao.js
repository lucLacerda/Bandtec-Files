const root = window.document.getElementById('root');

// const titulo = window.document.createElement('h1');
// titulo.innerHTML = "MEU PRIMEIRO TITULO COM JS";
// root.appendChild(titulo);

function Titulo(props) {
    return (
        <>
            <h1> {props.texto} </h1>
        </>
    );
}

function Titulos() {
    return (
        <>
            <Titulo texto="Este é o primeiro titulo" />
            <Titulo texto="Venho depois do primeiro" />
            <Titulo texto="Eu sou o do meio" />
            <Titulo texto="Eu sou o penultimo" />
            <Titulo texto="Este é o ultimo titulo" />
        </>
    );
}

ReactDOM.createRoot(root).render(<Titulos />);