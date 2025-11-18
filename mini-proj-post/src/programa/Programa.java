/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import entidades.Comentario;
import entidades.Post;
import entidades.Usuario;
import enums.EstadosDeEspirito;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Programa {

    public void programa() {
        Scanner sc = new Scanner(System.in);
        int op;
        int op2;

        Post p = new Post();
        int numPosts = 0;
        ArrayList<Post> posts = new ArrayList<>();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("CADASTRO DE USUARIO: ");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("USERNAME: ");
        String username = sc.nextLine();
        System.out.print("SENHA: ");
        String senha = sc.nextLine();
        System.out.print("DATA DE NASCIMENTO: ");
        String aniversario = sc.nextLine();

        LocalDate dataAni = LocalDate.parse(aniversario, fmt2);

        Usuario u = new Usuario(nome, username, senha, dataAni);

        do {
            System.out.println();
            System.out.println("1- POSTAR");
            System.out.println("2- COMENTAR");
            System.out.println("3- VER POSTS");
            System.out.println("4- VER PERFIL DO USUARIO");
            System.out.println("0-TERMINAR SESSAO");
            System.out.print("ESCOLHA UMA OPCAO: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> {

                    System.out.println();
                    System.out.println("CRIAR NOVO POST");
                    System.out.println();
                    sc.nextLine();
                    System.out.println("COMO ESTA SE SENTINDO HOJE? ");
                    System.out.print("MUITO_FELIZ/FELIZ/NORMAL/TRISTE/MUITO_TRISTE: ");
                    EstadosDeEspirito estado = EstadosDeEspirito.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("DIGITE O TITULO DO POST: ");
                    String tituloPost = sc.nextLine().toUpperCase();

                    System.out.print("ADICIONE A DESCRICAO DO POST: ");
                    String descricao = sc.nextLine();

                    LocalDateTime agora = LocalDateTime.now();
                    String agoratxt = agora.format(fmt1);
                    LocalDateTime momento = LocalDateTime.parse(agoratxt, fmt1);

                    p = new Post(tituloPost, descricao, estado, momento, u);
                    posts.add(p);
                    break;
                }
                case 2 -> {
                    do {
                        System.out.println();
                        System.out.println("1- ADICIONAR COMENTARIOS");
                        System.out.println("2- REMOVER COMENTARIOS");
                        System.out.println("0- VOLTAR AO MENU PRINCIPAL");
                        System.out.print("ESCOLHA UMA OPCAO: ");
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1 -> {
                                if (posts.isEmpty()) {
                                    System.out.print("NAO HA NENHUM POST DISPONIVEL! Deseja adicionar um post(S-Sim / N-Nao)? ");
                                    char resposta = sc.next().charAt(0);
                                    if (resposta == 'S' || resposta == 's') {
                                        System.out.println();
                                        System.out.println("CRIAR NOVO POST");
                                        System.out.println();
                                        sc.nextLine();
                                        System.out.println("COMO ESTA SE SENTINDO HOJE? ");
                                        System.out.println("MUITO_FELIZ/FELIZ/NORMAL/TRISTE/MUITO_TRISTE: ");
                                        EstadosDeEspirito estado = EstadosDeEspirito.valueOf(sc.nextLine().toUpperCase());
                                        System.out.print("DIGITE O TITULO DO POST: ");
                                        String tituloPost = sc.nextLine().toUpperCase();

                                        System.out.print("ADICIONE A DESCRICAO DO POST: ");
                                        String descricao = sc.nextLine();

                                        LocalDateTime agora = LocalDateTime.now();
                                        String agoratxt = agora.format(fmt1);
                                        LocalDateTime momento = LocalDateTime.parse(agoratxt, fmt1);

                                        p = new Post(tituloPost, descricao, estado, momento, u);
                                        posts.add(p);
                                        break;
                                    } 
                                    else {
                                        break;
                                    }
                                } 
                                else {

                                    for (Post pst : posts) {
                                        System.out.println(pst.toString());
                                        System.out.println();
                                    }

                                    System.out.print("DIGITE O TITULO DO POST QUE DESEJA COMENTAR: ");
                                    sc.nextLine();
                                    String tituloPesquisa = sc.nextLine().toUpperCase();

                                    for (Post pst : posts) {
                                        if (pst.getTitulo().equalsIgnoreCase(tituloPesquisa)) {
                                            System.out.println();
                                            System.out.println("POST ENCONTRADO");
                                            System.out.println();
                                            System.out.println("ADICIONAR COMENTARIO");
                                            System.out.print("ADICIONE A DESCRICAO DO COMENTARIO: ");
                                            String descricaoComent = sc.nextLine();
                                            LocalDateTime mmtC = LocalDateTime.now();
                                            String mmtCm = mmtC.format(fmt1);
                                            LocalDateTime momentoC = LocalDateTime.parse(mmtCm, fmt1);

                                            Comentario cm = new Comentario(descricaoComent, momentoC);
                                            pst.adicionarComentario(cm);
                                        } 
                                        else {
                                            System.out.println("NAO EXISTE NENHUM POST COM ESSE TITULLO!");
                                        }
                                    }
                                }
                                break;
                            }
                            case 2 -> {
                                if (posts.isEmpty()) {
                                    System.out.println("NAO HA POSTS DISPONIVEIS!\n");
                                    break;
                                } 
                                else {
                                    System.out.println();
                                    for (Post pst : posts) {
                                        System.out.println(pst.toString());
                                        System.out.println();
                                    }
                                    
                                    sc.nextLine();
                                    System.out.print("DIGITE O TITULO DO POST DO COMENTARIO A APAGAR: ");
                                    String tituloPesquisa = sc.nextLine().toUpperCase();

                                    for (Post pst : posts) {
                                        if (pst.getTitulo().equalsIgnoreCase(tituloPesquisa)) {
                                            System.out.print("DIGITE O A POSICAO DO COMENTARIO QUE DESEJA APAGAR: ");
                                            int index = sc.nextInt();
                                            index -= 1;
                                            pst.removerComentario(index);
                                            System.out.println("COMENTARIO REMOVIDO COM SUCESSO...");
                                            break;
                                        } 
                                        else {
                                            System.out.println("NAO HA NENHUM POST COM ESSE TITULO! Tente outra vez.");
                                        }
                                    }
                                }
                                break;
                            }
                        }

                    } while (op2 != 0);
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("POSTS:");
                    for (Post pst : posts) {
                        System.out.println(pst.toString());
                        System.out.println();
                    }
                    break;
                }
                case 4 -> {
                    System.out.println();
                    System.out.println(u.toString());
                    break;
                }
            }

        } while (op != 0);
    }
}
