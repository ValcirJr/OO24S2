package br.edu.utfpr.database;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.model.Model;
import br.edu.utfpr.repository.AlunoRepository;
import br.edu.utfpr.repository.DisciplinaRepository;
import br.edu.utfpr.repository.Repository;
import br.edu.utfpr.statement.AlunoStatement;
import br.edu.utfpr.statement.Statement;

import java.util.List;

public class TableControl {
    public static final List<Repository<?, ?>> NEW_TABLES_V1 =
            List.of(
                    new AlunoRepository(),
                    new DisciplinaRepository()
            );

    public static void createTablesV1(){
        System.out.println("INICIANDO CRIAÇÃO DE TABELAS");
        NEW_TABLES_V1.forEach(Repository::createTable);
        System.out.println("FIM DA CRIAÇÃO DE TABELAS");
    }
}
