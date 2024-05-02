
import './App.css';
import Comentario from './componentes/comentario.jsx';

function App() {
  return (
    <div className="App">
      
      <div className='contenedor-principal'>
        <h1>Esto es lo que dicen los alumnos sobre los cursos del INA:</h1>
        <Comentario nombre="Emma Castro Rojas"   
        provincia= "Guanacaste"
        cargo="Desarrolladora"
        empresa="Spotify"
        comentario="
        He tomado muchos cursos, pero el curso de Programador fue el que mas
        me sirvió. Estudiar JavaScript, así como estructuras de datos y algoritmos
        en el INA me dio las habilidades y la confianza que necesitaba para conseguir
        el trabajo de mis sueños como ingeniera de software en Spotify."
        imagen= "shawn"
        ></Comentario>
        <Comentario nombre="Sarah Castro Rojas"   
        provincia= "Limón"
        cargo="Ingeniero"
        empresa="Amazon"
        comentario="
        He tomado muchos cursos, pero el curso de Programador fue el que mas
        me sirvió. Estudiar JavaScript, así como estructuras de datos y algoritmos
        en el INA me dio las habilidades y la confianza que necesitaba para conseguir
        el trabajo de mis sueños como ingeniera de software en Spotify."
        imagen= "emma"
        ></Comentario>
        <Comentario nombre="Shawn Castro Rojas"   
        provincia= "Heredia"
        cargo="Desarrollador"
        empresa="Infoware"
        comentario="
        He tomado muchos cursos, pero el curso de Programador fue el que mas
        me sirvió. Estudiar JavaScript, así como estructuras de datos y algoritmos
        en el INA me dio las habilidades y la confianza que necesitaba para conseguir
        el trabajo de mis sueños como ingeniera de software en Spotify."
        imagen= "sarah"
        ></Comentario>
      </div>
    </div>
  );
}

export default App;
