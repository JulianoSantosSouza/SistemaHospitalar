
package visao;

import dao.ConvenioDAO;
import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.Convenio;
import modelo.Paciente;
import servicos.ConvenioServicos;
import servicos.ServicosFactory;

public class GuiCadPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiCadPaciente
     */
    public GuiCadPaciente() {
        initComponents();
        preencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jlEspecialidade = new javax.swing.JLabel();
        jlDataNasc = new javax.swing.JLabel();
        jtDataNasc = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jlEmail1 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlRG = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jcConvenio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimpar = new javax.swing.JButton();
        jbCadastrar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRO PACIENTE");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setOpaque(true);

        jlNome.setText("Nome*");
        jLayeredPane1.add(jlNome);
        jlNome.setBounds(40, 20, 60, 30);

        jlCpf.setText("CPF*");
        jLayeredPane1.add(jlCpf);
        jlCpf.setBounds(40, 60, 90, 30);

        jlEndereco.setText("Endereço*");
        jLayeredPane1.add(jlEndereco);
        jlEndereco.setBounds(40, 140, 60, 30);
        jLayeredPane1.add(jtNome);
        jtNome.setBounds(140, 20, 210, 30);
        jLayeredPane1.add(jtCpf);
        jtCpf.setBounds(140, 60, 110, 30);
        jLayeredPane1.add(jtEndereco);
        jtEndereco.setBounds(140, 140, 210, 30);

        jlEspecialidade.setText("Convênio*");
        jLayeredPane1.add(jlEspecialidade);
        jlEspecialidade.setBounds(40, 300, 100, 30);

        jlDataNasc.setText("Data Nascimento*");
        jLayeredPane1.add(jlDataNasc);
        jlDataNasc.setBounds(40, 260, 100, 30);

        jtDataNasc.setToolTipText("(dd/mm/aaaa)");
        jLayeredPane1.add(jtDataNasc);
        jtDataNasc.setBounds(140, 260, 210, 30);

        jtTelefone.setToolTipText("(xx) xxxx-xxxx");
        jLayeredPane1.add(jtTelefone);
        jtTelefone.setBounds(140, 180, 130, 30);

        jlTelefone.setText("Telefone*");
        jLayeredPane1.add(jlTelefone);
        jlTelefone.setBounds(40, 180, 50, 30);

        jlEmail1.setText("E-mal");
        jLayeredPane1.add(jlEmail1);
        jlEmail1.setBounds(40, 220, 90, 30);
        jLayeredPane1.add(jtEmail);
        jtEmail.setBounds(140, 220, 210, 30);

        jlRG.setText("RG");
        jLayeredPane1.add(jlRG);
        jlRG.setBounds(40, 100, 90, 30);
        jLayeredPane1.add(jtRG);
        jtRG.setBounds(140, 100, 210, 30);

        jLayeredPane1.add(jcConvenio);
        jcConvenio.setBounds(140, 300, 150, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Informações do paciente obrigatória \"*\"");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(30, 340, 230, 14);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(290, 20, 140, 40);

        jbCadastrar1.setText("cadastrar");
        jbCadastrar1.setMinimumSize(new java.awt.Dimension(78, 20));
        jbCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbCadastrar1);
        jbCadastrar1.setBounds(80, 20, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar() throws SQLException{
        
            PacienteDAO paciente = new PacienteDAO();
            
            // Verificando se os campos do paciente foi preeenchido corretamente
             String nome = jtNome.getText();
             String cpf = jtCpf.getText();
             String endereco = jtEndereco.getText();
             String telefone = jtTelefone.getText();
             String email = jtEmail.getText();
             String datNasc = jtDataNasc.getText();
             
            //Verificando campo nome do Paciente
             if (nome.isEmpty()){
                JOptionPane.showMessageDialog(this, "Digite o nome do Paciente");
                return;
            } else if (nome.length() >= 55) {
                JOptionPane.showMessageDialog(this, "O nome não pode ter mais de 55 caracteres");
                jtNome.setText("");
                return;
            }
             
            //Verificando campo CPF do Paciente
            if (cpf.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite o CPF do Paciente");
                return;
            }else if (!cpf.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(this, "O CPF deve conter apenas números e ter 11 dígitos");
                jtCpf.setText(""); // Limpando o campo para digitar novamente
                return;
            }else if (paciente.cpfJaCadastrado(cpf)) {
                JOptionPane.showMessageDialog(this, "CPF já cadastrado. Insira um CPF único.");
                jtCpf.setText(""); // Limpando o campo para digitar novamente
                return;
                }
                
            //Verificando campo Endereço do Paciente
            if(endereco.isEmpty()){
                JOptionPane.showMessageDialog(this, "Digite o Endereço do Paciente");
                return;
            } else if (endereco.length() >= 200) {
                JOptionPane.showMessageDialog(this, "O Endereço não pode ter mais de 200 caracteres");
                jtEndereco.setText("");
                return;
            }
            
            //Verificando campo Telefone do Paciente
            if (telefone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite o telefone do Paciente");
                return;
            } else if (!telefone.matches("\\(\\d{2}\\)\\d{5}-\\d{4}")) {
                JOptionPane.showMessageDialog(this, "O telefone deve ter o formato: '(xx)xxxxx-xxxx'");
                jtTelefone.setText("");
                return;
                
                
            //Caso o usuário tente cadastrar um email no campo destinado a essa informação    
            }else if(!email.isEmpty() && !paciente.EmailValido(email)) {
                JOptionPane.showMessageDialog(this, "Digite um e-mail válido");
                return;
            }
            
            //Verificando campo data de nascimento do Paciente
            if(datNasc.isEmpty()){
                JOptionPane.showMessageDialog(this, "Digite a Data de Nascimento do Paciente");
                return;
                }else{
                    
                }
                        
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        
            Paciente pac = new Paciente();
            // Atribuindo valores aos atributos do Paciente com base nos campos preenchidos pelo usuário na tela
            pac.setNome(jtNome.getText());
            pac.setEndereco(jtEndereco.getText());
            pac.setDataNascimento(sdf.parse(jtDataNasc.getText()));
            pac.setTelefone(jtTelefone.getText());
            pac.setCpf(jtCpf.getText());
            pac.setRg(jtRG.getText());
            pac.setEmail(jtEmail.getText());
            
            // Verificando se um convênio foi selecionado no JComboBox
            if (!(jcConvenio.getSelectedIndex() == 0)) {

                // Obtendo o nome do convênio selecionado pelo usuário
                String conv = jcConvenio.getSelectedItem().toString();

                // Criando objeto ConvenioDAO para buscar o convênio no banco de dados
                ConvenioDAO convDAO = new ConvenioDAO();

                // Buscando o convênio no banco de dados com base no nome selecionado pelo usuário
                Convenio convenio = convDAO.buscarConvenioFiltro(conv);

                // Atribuindo o ID do convênio ao paciente
                pac.setConvenio(convenio.getIdConvenio());

            } else {
                JOptionPane.showMessageDialog(this,"Selecione um Convênio");
            } // fecha else
            
           // Criando objeto PacienteDAO para cadastrar o paciente no banco de dados
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.cadastrarPaciente(pac);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
            limpar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar paciente: ");
            } catch (ParseException pe) {
                JOptionPane.showMessageDialog(this, "Erro ao converter data: ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cadastro não realizado com sucesso");
            }
        }
    

      
    // metodo para preencher o combo box com os produtos cadastrados no banco de dados
    private void preencherCombo() {
        try {

            // Buscando objeto ProdutoServicos
            ConvenioServicos ps = ServicosFactory.getConvenioServicos();

            /*
             * Criando um ArrayList<ProdutoVO> vazio
             * para receber o ArrayList com os dados
             */
            ArrayList<Convenio> p = new ArrayList<>();

            // Recebendo o ArrayList cheio em produtos
            p = ps.buscarConvenio();

            // Adicionando os dados do ArrayList no JComboBox
            jcConvenio.addItem("-Selecione-");
            for (int i = 0; i < p.size(); i++) {

                // Adicionando o nome do convênio ao JComboBox
                jcConvenio.addItem(p.get(i).getNomeConvenio());

            } // fecha for

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        } // fecha catch
    }// fecha classe

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void jbCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            cadastrar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar paciente: " + ex.getMessage());
        }
        
        
    }
    
    //apaga valores dos campos
    private void limpar() {
        jtNome.setText("");
        jtCpf.setText("");
        jtRG.setText("");
        jtEndereco.setText("");
        jtTelefone.setText("");
        jtEmail.setText("");
        jtDataNasc.setText("");
        jcConvenio.setSelectedIndex(0);
        
        
    }// fecha método

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar1;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcConvenio;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEspecialidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtDataNasc;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtRG;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
