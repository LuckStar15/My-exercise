import mysql.connector

banco = mysql.connector.connect(
    host="localhost",
    user="root",
    password="123456",
    database="turma_b"
)

opcao = 0
while opcao !=3:
    opcao = int(input("Digite\n"
                     "1- para pesquisar\n"
                     "2- para inserir\n"
                     "3- para sair\n"
                     ""))
    if opcao == 1:
        meucursor= banco.cursor()
        pesquisa='select * from alunos;'
        meucursor.execute(pesquisa)
        resultado=meucursor.fetchall()
        for x in resultado:
            print(x)

    if opcao ==2:
        meucursor = banco.cursor()
        nome1= input("Digite um nome:")
        telefone1= input("Digite um número de telefone:")
        sql = "INSERT INTO alunos (nome,telefone) VALUES (%s,%s)"
        data = (nome1,telefone1)

        meucursor.execute(sql, data)
        banco.commit()
        meucursor.close()
        banco.close()

    if opcao == 3:
        print("sessão encerrada")
