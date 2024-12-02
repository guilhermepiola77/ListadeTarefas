package view;

import model.GerenciadorTarefas;
import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "1. Adicionar tarefa\n" +
                            "2. Exibir tarefas\n" +
                            "3. Concluir tarefa\n" +
                            "4. Remover tarefa\n" +
                            "5. Sair"
            );

            if (opcao == null || opcao.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }

            switch (opcao) {
                case "1":
                    GerenciadorTarefas.adicionarTarefa();
                    break;
                case "2":
                    GerenciadorTarefas.exibirTarefas();
                    break;
                case "3":
                    GerenciadorTarefas.concluirTarefa();
                    break;
                case "4":
                    GerenciadorTarefas.removerTarefa();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
