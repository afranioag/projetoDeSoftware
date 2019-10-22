package api02.lab1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCont {
	
	@Autowired AlunoServices alunoService;
	
	@PostMapping("api/alunos")
	public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
		return new ResponseEntity<Aluno>(alunoService.addAluno(aluno),
				HttpStatus.OK);
	}
	
	@GetMapping("api/alunos")
	public ResponseEntity<List<Aluno>> exibeAlunos(){
		return new ResponseEntity<List<Aluno>>(alunoService.exibeAlunos(), 
				HttpStatus.OK);			
	}
	
	@GetMapping("api/alunos/addMassa")
	public ResponseEntity<List<Aluno>> addAlunos(){
		return new ResponseEntity<List<Aluno>>(alunoService.addAlunos(), 
				HttpStatus.OK);			
	}
	
	@GetMapping("api/alunos/{id}")
	public ResponseEntity<Aluno> exibeAluno(@PathVariable("id") Integer id){
		if(alunoService.exibeAluno(id) == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Aluno>(alunoService.exibeAluno(id), HttpStatus.OK);
	}
	
}






