import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLoginPaciente extends JFrame {

    public TelaLoginPaciente() {
        // Configurações da janela principal
        setTitle("VivaCore - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com BoxLayout para organizar os componentes verticalmente
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel title = new JLabel("VivaCore");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(39, 174, 96));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        JLabel subtitle = new JLabel("Entre no seu sistema");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(subtitle);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Espaçamento

        // Formulário de login
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        formPanel.add(new JLabel("E-mail:"));
        JTextField emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Senha:"));
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField);

        mainPanel.add(formPanel);

        // Botão Entrar
        JButton loginButton = new JButton("Entrar");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(39, 174, 96));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Espaçamento
        mainPanel.add(loginButton);

        // Esqueceu a senha
        JLabel forgotPasswordLabel = new JLabel("Esqueceu a senha?");
        forgotPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        forgotPasswordLabel.setForeground(new Color(231, 76, 60));
        forgotPasswordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Pequeno espaçamento
        mainPanel.add(forgotPasswordLabel);

        // Ação do botão Entrar
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String senha = new String(passwordField.getPassword());

                if (email.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Aqui você pode implementar a lógica de autenticação
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Adiciona o painel principal à janela
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLoginPaciente telaLogin = new TelaLoginPaciente();
            telaLogin.setVisible(true);
        });
    }
}
