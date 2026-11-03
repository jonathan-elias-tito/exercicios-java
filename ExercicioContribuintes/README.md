# 📊 Sistema de Cálculo de Impostos (Classes e Métodos Abstratos)

Aplicação desenvolvida em **Java** para consolidar o uso de **Classes Abstratas**, **Métodos Abstratos** e **Polimorfismo** aplicados a um cenário real de cálculo de tributos para pessoas físicas e jurídicas.

---

## 🚀 Sobre o Projeto
O programa calcula o imposto devido por diferentes tipos de contribuintes ao longo de um ano fiscal:
1. **Pessoa Física (`Individuo`):** Paga 15% de imposto se a renda anual for abaixo de 20.000, ou 25% caso contrário. Tem direito a deduzir 50% dos seus gastos com saúde do imposto devido.
2. **Pessoa Jurídica (`Empresa`):** Paga 16% de imposto sobre a renda anual. Caso possua mais de 10 funcionários, a alíquota reduz para 14%.

Através de uma superclasse abstrata (`Contribuinte`) e de um método abstrato (`imposto()`), a aplicação utiliza polimorfismo para processar todos os contribuintes numa única lista e calcular o montante total arrecadado.

---

## 🛠️ Tecnologias e Conceitos Utilizados
* **Linguagem:** Java
* **Conceitos OOP:** Classes Abstratas, Métodos Abstratos, Herança, Polimorfismo e Sobrescrita (`@Override`).
* **Estruturas de Dados:** `List`, `ArrayList` e manipulação de fluxos com `Scanner`.

---

## 💻 Exemplo de Execução

### **Entrada:**
```text
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00

Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25

Tax payer #3 data:
Individual or company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00