package model;

import javax.swing.*;
import java.util.ArrayList;

public class GerenciadorTarefas {
    private static ArrayList<String> tarefas = new ArrayList<>();

    public static void adicionarTarefa() {
        String descricao = JOptionPane.showInputDialog("Digite a tarefa:");
        if (descricao != null && !descricao.trim().isEmpty()) {
            tarefas.add(descricao);
            JOptionPane.showMessageDialog(null, "Tarefa adicionada!");
        } else {
            JOptionPane.showMessageDialog(null, "Descrição inválida.");
        }
    }

    public static void exibirTarefas() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa.");
            return;
        }

        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < tarefas.size(); i++) {
            lista.append(i).append(". ").append(tarefas.get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public static void concluirTarefa() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa para concluir.");
            return;
        }

        String escolha = JOptionPane.showInputDialog("Escolha a tarefa para concluir (índice):");
        try {
            int indice = Integer.parseInt(escolha);
            if (indice >= 0 && indice < tarefas.size()) {
                String tarefaConcluida = tarefas.get(indice) + " (Concluída)";
                tarefas.set(indice, tarefaConcluida);
                JOptionPane.showMessageDialog(null, "Tarefa concluída!");
            } else {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
        }
    }

    public static void removerTarefa() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa para remover.");
            return;
        }

        String escolha = JOptionPane.showInputDialog("Escolha a tarefa para remover (índice):");
        try {
            int indice = Integer.parseInt(escolha);
            if (indice >= 0 && indice < tarefas.size()) {
                tarefas.remove(indice);
                JOptionPane.showMessageDialog(null, "Tarefa removida!");
            } else {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
        }
    }
}
