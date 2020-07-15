package HerancaPolimorfismoCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();

        int escolha;
        String produto, atualizacao;

        do
        {
            System.out.println("Escolha uma a��o:\n (1) Adicionar um produto;\n "
                    + "(2) Remover um produto;\n (3) Atualizar um produto;\n "
                    + "(4) Exibir a lista de produtos;\n (0) Fechar o programa.\n");
            escolha = ler.nextInt();

            if(escolha == 1)
            {
                System.out.println("Digite o produto para adicionar � lista: ");
                produto = ler.next();
                estoque.add(produto);
            }

            else if(escolha == 2)
            {
                System.out.println("Digite o produto para remover da lista: ");
                produto = ler.next();
                estoque.remove(produto);
            }

            else if(escolha == 3)
            {
                System.out.println("Digite a atualiza��o do produto: ");
                atualizacao = ler.next();

                System.out.println("Digite o produto para remover da lista: ");
                produto = ler.next();

                if(estoque.contains(produto))
                {
                    estoque.remove(produto);
                    estoque.add(atualizacao);
                }
            }

            else if(escolha == 4)
                System.out.println("Produtos do estoque: " + estoque + "\n");

            else
                System.out.println("Escolha errada!");
        }
        while(escolha != 0);
    }
}