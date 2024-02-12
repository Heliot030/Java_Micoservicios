package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.model.Curso;

import jakarta.annotation.PostConstruct;

@RestController
public class CursosContorller {
	
	private List<Curso> cursos;
	@PostConstruct
	public void init() {
		cursos = new ArrayList<>();
		cursos.add(new Curso("Sprint", 25 , "Tarde"));
		cursos.add(new Curso("Java", 25 , "Tarde"));
		cursos.add(new Curso("Python", 5 , "mañana"));
		cursos.add(new Curso("Web", 20, "noche"));
		cursos.add(new Curso("CSS", 25 , "mañana"));
	}
	
	@GetMapping(value = "cursos" , produces = MediaType.APPLICATION_XML_VALUE)
	public List<Curso> getCursos(){
		return cursos;
	}
	
	@GetMapping(value = "curso" , produces = MediaType.APPLICATION_XML_VALUE)
	public Curso getCurso(){
		return new Curso("Java", 100, "Mañana");
	}
	@GetMapping(value = "cursos/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursos(@PathVariable("name")String nombre){
		List<Curso> aux = new ArrayList<>();
		for(Curso c: cursos) {
			if(c.getNombre().contains(nombre)) {
				aux.add(c);
			}
		}
		return aux;
	}
}
