import javax.swing.*;
import java.awt.*;

public class TelaPaciente extends JFrame {

    public TelaPaciente() {
        // Configurações da janela
        setTitle("VivaCore - Paciente");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Título e botão de saída
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Bem Vindo, Paciente", JLabel.LEFT);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeLabel.setForeground(new Color(39, 174, 96));

        JButton logoutButton = new JButton("Sair");
        logoutButton.setBackground(new Color(231, 76, 60));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFocusPainted(false);

        headerPanel.add(welcomeLabel, BorderLayout.WEST);
        headerPanel.add(logoutButton, BorderLayout.EAST);
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Painel de estatísticas
        JPanel statsPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        statsPanel.add(createStatCard("Total de Consultas", "5"));
        statsPanel.add(createStatCard("Consultas do Mês", "3"));
        statsPanel.add(createStatCard("Consultas Pendentes", "0"));
        mainPanel.add(statsPanel, BorderLayout.CENTER);

        // Painel de informações
        JPanel infoPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        infoPanel.add(createInfoCard("Dados Pessoais", 
                "Nome: João Silva\n" +
                "Idade: 35 anos\n" +
                "Sexo: Masculino\n" +
                "Telefone: (11) 98765-4321\n" +
                "Email: joao.silva@email.com"));
        infoPanel.add(createInfoCard("Histórico de Saúde", 
                "Doenças pré-existentes: Hipertensão\n" +
                "Alergias: Nenhuma\n" +
                "Medicações em uso: Losartana"));
        infoPanel.add(createInfoCardWithButton("Próximos Exames", 
                "Exame de sangue agendado para 15/05/2024"));
        infoPanel.add(createInfoCardWithButton("Consultas Agendadas", 
                "Consulta com o Dr. Carlos marcada para 10/05/2024"));

        mainPanel.add(infoPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JPanel createStatCard(String title, String value) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));
        card.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setForeground(new Color(100, 100, 100));

        JLabel valueLabel = new JLabel(value, JLabel.CENTER);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 24));
        valueLabel.setForeground(new Color(39, 174, 96));

        card.add(titleLabel, BorderLayout.NORTH);
        card.add(valueLabel, BorderLayout.CENTER);

        return card;
    }

    private JPanel createInfoCard(String title, String details) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));
        card.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setForeground(new Color(39, 174, 96));

        JTextArea detailsArea = new JTextArea(details);
        detailsArea.setFont(new Font("Arial", Font.PLAIN, 12));
        detailsArea.setEditable(false);
        detailsArea.setBackground(Color.WHITE);
        detailsArea.setLineWrap(true);
        detailsArea.setWrapStyleWord(true);

        card.add(titleLabel, BorderLayout.NORTH);
        card.add(detailsArea, BorderLayout.CENTER);

        return card;
    }

    private JPanel createInfoCardWithButton(String title, String details) {
        JPanel card = createInfoCard(title, details);

        JButton detailsButton = new JButton("Ver Detalhes");
        detailsButton.setBackground(new Color(39, 174, 96));
        detailsButton.setForeground(Color.WHITE);
        detailsButton.setFocusPainted(false);
        detailsButton.setFont(new Font("Arial", Font.BOLD, 12));

        card.add(detailsButton, BorderLayout.SOUTH);

        return card;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPaciente telaPaciente = new TelaPaciente();
            telaPaciente.setVisible(true);
        });
    }
}

