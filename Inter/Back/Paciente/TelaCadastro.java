import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroPaciente extends JFrame {

    public TelaCadastroPaciente() {
        // Configurações da janela principal
        setTitle("Cadastro para Participação em Pesquisa Cardiovascular");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com BoxLayout para organizar os componentes verticalmente
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel title = new JLabel("Cadastro para Participação em Pesquisa Cardiovascular");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        JLabel subtitle = new JLabel("Preencha o formulário abaixo para se candidatar a uma pesquisa.");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(subtitle);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Espaçamento

        // Painel para Dados Pessoais e Histórico de Saúde (lado a lado)
        JPanel formsPanel = new JPanel(new GridLayout(1, 2, 20, 20));

        // Painel de Dados Pessoais
        JPanel personalPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        personalPanel.setBorder(BorderFactory.createTitledBorder("Dados Pessoais"));

        personalPanel.add(new JLabel("Nome Completo:"));
        JTextField nomeField = new JTextField();
        personalPanel.add(nomeField);

        personalPanel.add(new JLabel("Data de Nascimento:"));
        JTextField nascimentoField = new JTextField("dd/mm/aaaa");
        personalPanel.add(nascimentoField);

        personalPanel.add(new JLabel("Gênero:"));
        JComboBox<String> generoBox = new JComboBox<>(new String[]{"Selecione", "Masculino", "Feminino", "Outro"});
        personalPanel.add(generoBox);

        personalPanel.add(new JLabel("Telefone de Contato:"));
        JTextField telefoneField = new JTextField();
        personalPanel.add(telefoneField);

        personalPanel.add(new JLabel("E-mail:"));
        JTextField emailField = new JTextField();
        personalPanel.add(emailField);

        personalPanel.add(new JLabel("Endereço:"));
        JTextField enderecoField = new JTextField();
        personalPanel.add(enderecoField);

        // Painel de Histórico de Saúde
        JPanel healthPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        healthPanel.setBorder(BorderFactory.createTitledBorder("Histórico de Saúde"));

        healthPanel.add(new JLabel("Histórico de doenças cardiovasculares:"));
        JComboBox<String> historicoDoencasBox = new JComboBox<>(new String[]{"Selecione", "Sim", "Não"});
        healthPanel.add(historicoDoencasBox);

        healthPanel.add(new JLabel("Se sim, descreva:"));
        JTextField descricaoHistoricoField = new JTextField();
        healthPanel.add(descricaoHistoricoField);

        healthPanel.add(new JLabel("Já fez algum exame cardiovascular?"));
        JComboBox<String> exameBox = new JComboBox<>(new String[]{"Selecione", "Sim", "Não"});
        healthPanel.add(exameBox);

        healthPanel.add(new JLabel("Está atualmente em tratamento médico?"));
        JComboBox<String> tratamentoBox = new JComboBox<>(new String[]{"Selecione", "Sim", "Não"});
        healthPanel.add(tratamentoBox);

        healthPanel.add(new JLabel("Se sim, qual tratamento?"));
        JTextField descricaoTratamentoField = new JTextField();
        healthPanel.add(descricaoTratamentoField);

        healthPanel.add(new JLabel("")); // Espaço vazio

        formsPanel.add(personalPanel);
        formsPanel.add(healthPanel);

        mainPanel.add(formsPanel);

        // Termos e botão
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new BoxLayout(actionPanel, BoxLayout.Y_AXIS));
        actionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JCheckBox termosBox = new JCheckBox("Aceito os termos e condições da pesquisa.");
        termosBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        actionPanel.add(termosBox);

        JButton enviarButton = new JButton("Enviar Cadastro");
        enviarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        enviarButton.setBackground(new Color(39, 174, 96));
        enviarButton.setForeground(Color.WHITE);
        enviarButton.setFocusPainted(false);
        enviarButton.setFont(new Font("Arial", Font.BOLD, 14));
        actionPanel.add(enviarButton);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Espaçamento
        mainPanel.add(actionPanel);

        // Ação do botão Enviar
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termosBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Você precisa aceitar os termos para continuar!", "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cadastro enviado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Adiciona o painel principal à janela
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCadastroPaciente tela = new TelaCadastroPaciente();
            tela.setVisible(true);
        });
    }
}
