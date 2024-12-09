import javax.swing.*;
import java.awt.*;

public class TelaCriarPesquisa extends JFrame {

    public TelaCriarPesquisa() {
        // Configurações da janela
        setTitle("VivaCore - Criar Nova Pesquisa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 248, 245)); // Fundo em verde claro

        // Título
        JLabel titleLabel = new JLabel("Criar Nova Pesquisa", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(39, 174, 96));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Painel de formulário
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(9, 2, 10, 10));
        formPanel.setBackground(new Color(240, 248, 245));

        // Campos do formulário
        addFormField(formPanel, "Nome da Pesquisa:");
        addFormField(formPanel, "Objetivo da Pesquisa:");
        addFormField(formPanel, "Requisitos dos Pacientes:");
        addFormField(formPanel, "Tratamentos Envolvidos:");
        addFormField(formPanel, "Exames Necessários:");
        addFormField(formPanel, "Grupos de Pacientes:");
        addFormField(formPanel, "Tipo de Acompanhamento:");
        addFormField(formPanel, "Parâmetros de Exames e Medicamentos:");

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Botão de envio
        JButton createButton = new JButton("Criar Pesquisa");
        createButton.setBackground(new Color(39, 174, 96));
        createButton.setForeground(Color.WHITE);
        createButton.setFont(new Font("Arial", Font.BOLD, 14));
        createButton.setFocusPainted(false);
        createButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Pesquisa criada com sucesso!", 
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 248, 245));
        buttonPanel.add(createButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Adicionar painel principal à janela
        add(mainPanel);
    }

    private void addFormField(JPanel panel, String labelText) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField textField = new JTextField();
        panel.add(label);
        panel.add(textField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCriarPesquisa tela = new TelaCriarPesquisa();
            tela.setVisible(true);
        });
    }
}
