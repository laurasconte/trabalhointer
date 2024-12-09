import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipalPesquisador {

    // Criando a JFrame principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipalPesquisador();
            }
        });
    }

    public TelaPrincipalPesquisador() {
        // Criando a janela principal
        JFrame frame = new JFrame("VivaCore - Tela Principal Pesquisador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        // Painel com layout de borda
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        frame.add(painel);

        // Barra lateral (Menu)
        JPanel menuLateral = criarMenuLateral();
        painel.add(menuLateral, BorderLayout.WEST);

        // Painel principal
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painel.add(painelPrincipal, BorderLayout.CENTER);

        // Barra de título e logout
        JPanel topo = new JPanel();
        topo.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel titulo = new JLabel("Bem Vindo, Pesquisador");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        topo.add(titulo);
        
        // Botão de logout
        JButton btnLogout = new JButton("Sair");
        btnLogout.setBackground(new Color(231, 76, 60));
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFont(new Font("Arial", Font.PLAIN, 14));
        btnLogout.setFocusPainted(false);
        topo.add(btnLogout);

        painelPrincipal.add(topo, BorderLayout.NORTH);

        // Cards principais
        JPanel painelCards = criarCards();
        painelPrincipal.add(painelCards, BorderLayout.CENTER);

        // Exibir a janela
        frame.setVisible(true);
    }

    // Método para criar o menu lateral
    private JPanel criarMenuLateral() {
        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(new Color(44, 110, 73)); // Verde escuro

        // Título da aplicação no menu
        JLabel logo = new JLabel("VivaCore", JLabel.CENTER);
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        logo.setForeground(Color.WHITE);
        menu.add(logo);
        menu.add(Box.createRigidArea(new Dimension(0, 30)));

        // Menu de navegação
        String[] opcoesMenu = {"Gerenciar Exames", "Controle de Medicamentos", "Elaborar Relatórios", "Gerenciar Pacientes", "Ver Candidatos"};
        for (String opcao : opcoesMenu) {
            JButton botao = new JButton(opcao);
            botao.setAlignmentX(Component.CENTER_ALIGNMENT);
            botao.setFont(new Font("Arial", Font.PLAIN, 16));
            botao.setBackground(new Color(39, 174, 96)); // Verde claro
            botao.setForeground(Color.WHITE);
            botao.setPreferredSize(new Dimension(200, 40));
            botao.setFocusPainted(false);
            botao.setBorderPainted(false);
            menu.add(botao);
            menu.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        return menu;
    }

    // Método para criar os cards de funcionalidades
    private JPanel criarCards() {
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(1, 3, 20, 20));
        painel.setBackground(new Color(241, 248, 246));

        // Card 1 - Gerenciar Exames
        JPanel card1 = new JPanel();
        card1.setBackground(Color.WHITE);
        card1.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        card1.setLayout(new BorderLayout());
        JLabel tituloCard1 = new JLabel("Gerenciar Exames", JLabel.CENTER);
        tituloCard1.setFont(new Font("Arial", Font.BOLD, 18));
        card1.add(tituloCard1, BorderLayout.NORTH);
        JTextArea descricaoCard1 = new JTextArea("Solicitar, acompanhar resultados e registrar observações dos exames.");
        descricaoCard1.setFont(new Font("Arial", Font.PLAIN, 14));
        descricaoCard1.setLineWrap(true);
        descricaoCard1.setWrapStyleWord(true);
        descricaoCard1.setBackground(Color.WHITE);
        descricaoCard1.setEditable(false);
        card1.add(descricaoCard1, BorderLayout.CENTER);
        JButton btnDetalhes1 = new JButton("Ver Detalhes");
        btnDetalhes1.setBackground(new Color(39, 174, 96));
        btnDetalhes1.setForeground(Color.WHITE);
        card1.add(btnDetalhes1, BorderLayout.SOUTH);
        painel.add(card1);

        // Card 2 - Controle de Medicamentos
        JPanel card2 = new JPanel();
        card2.setBackground(Color.WHITE);
        card2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        card2.setLayout(new BorderLayout());
        JLabel tituloCard2 = new JLabel("Controle de Medicamentos", JLabel.CENTER);
        tituloCard2.setFont(new Font("Arial", Font.BOLD, 18));
        card2.add(tituloCard2, BorderLayout.NORTH);
        JTextArea descricaoCard2 = new JTextArea("Monitorar prescrição e administração dos medicamentos.");
        descricaoCard2.setFont(new Font("Arial", Font.PLAIN, 14));
        descricaoCard2.setLineWrap(true);
        descricaoCard2.setWrapStyleWord(true);
        descricaoCard2.setBackground(Color.WHITE);
        descricaoCard2.setEditable(false);
        card2.add(descricaoCard2, BorderLayout.CENTER);
        JButton btnDetalhes2 = new JButton("Ver Detalhes");
        btnDetalhes2.setBackground(new Color(39, 174, 96));
        btnDetalhes2.setForeground(Color.WHITE);
        card2.add(btnDetalhes2, BorderLayout.SOUTH);
        painel.add(card2);

        // Card 3 - Relatórios
        JPanel card3 = new JPanel();
        card3.setBackground(Color.WHITE);
        card3.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        card3.setLayout(new BorderLayout());
        JLabel tituloCard3 = new JLabel("Elaborar Relatórios", JLabel.CENTER);
        tituloCard3.setFont(new Font("Arial", Font.BOLD, 18));
        card3.add(tituloCard3, BorderLayout.NORTH);
        JTextArea descricaoCard3 = new JTextArea("Criar relatórios detalhados sobre o progresso da pesquisa.");
        descricaoCard3.setFont(new Font("Arial", Font.PLAIN, 14));
        descricaoCard3.setLineWrap(true);
        descricaoCard3.setWrapStyleWord(true);
        descricaoCard3.setBackground(Color.WHITE);
        descricaoCard3.setEditable(false);
        card3.add(descricaoCard3, BorderLayout.CENTER);
        JButton btnDetalhes3 = new JButton("Ver Detalhes");
        btnDetalhes3.setBackground(new Color(39, 174, 96));
        btnDetalhes3.setForeground(Color.WHITE);
        card3.add(btnDetalhes3, BorderLayout.SOUTH);
        painel.add(card3);

        return painel;
    }
}
