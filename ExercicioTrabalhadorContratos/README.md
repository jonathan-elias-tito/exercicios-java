# 📊 Exercício: Sistema de Trabalhador e Contratos (Composição & Enums)

Projeto em Java focado na modelagem orientada a objetos utilizando **Enumerações**, **Composição de Objetos** e **Listas** para gerir contratos de trabalhadores e calcular ganhos mensais.

---

## 🎯 Principais Conceitos Aplicados

- **Enumerações (`enum`):** Categorização de níveis fixos de trabalhadores (`JUNIOR`, `MID_LEVEL`, `SENIOR`).
- **Composição de Objetos:** Associação de um `Worker` a um `Department` e manutenção de uma `List<HourContract>`.
- **Manipulação de Datas:** Utilização da API moderna `java.time.LocalDate` e divisão de strings para filtrar contratos por mês e ano.
- **Encapsulamento e Coleções:** Gestão de comportamentos de domínio, tais como adicionar/remover elementos de listas dentro de classes de entidade.

---

## 📌 Regras de Negócio Validadas

1. Um trabalhador pode ter zero ou vários contratos de horas associados a si.
2. O ganho total para um mês e ano específicos é calculado somando o salário base do trabalhador à soma de todos os valores de contratos correspondentes exatamente a esse período.

---

## 🚀 Como Executar

1. Importa a pasta `ExercicioContratoTrabalhador` para a tua IDE (Eclipse, VS Code ou IntelliJ).
2. Executa a classe `application.Program.java`.
3. Segue as instruções na consola para inserir os detalhes do departamento, informações do trabalhador, contratos e o mês/ano alvo (`MM/AAAA`).