from biblioteca import*
while True:
    opcao = int(input("Digite sua opção\n"
                      "1 para Gravar\n"
                      "2 para Ler\n"
                      "3 para Sair"))
    match opcao:
        case 1:
            t = input("Digite um texto:")
            gravar(t)

        case 2:
            leitor()

        case 3:
            break

        case 4:
            print("opção invalida")