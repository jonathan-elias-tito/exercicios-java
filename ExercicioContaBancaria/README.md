# 📦 Sistema de Gestão de Produtos (Herança e Polimorfismo)

Aplicação desenvolvida em **Java** com o objetivo de praticar e consolidar conceitos fundamentais de **Orientação a Objetos (OOP)**, nomeadamente **Herança**, **Polimorfismo**, **Classes Abstratas** e **sobreposição de métodos (`@Override`)**.

---

## 🚀 Sobre o Projeto
O programa simula um sistema de etiquetas de preço (`Price Tags`) para diferentes tipos de produtos comercializados numa loja:
1. **Produto Comum (`Product`):** Mantém apenas o nome e o preço base.
2. **Produto Importado (`ImportedProduct`):** Possui uma taxa alfandegária adicional que é somada ao preço base na etiqueta.
3. **Produto Usado (`UsedProduct`):** Apresenta uma indicação de uso e a respetiva data de fabricação formatada.

Através do **polimorfismo**, o sistema armazena todos os produtos numa lista genérica (`List<Product>`) e invoca o método `tag()` de forma dinâmica para cada subclasse.

---

## 🛠️ Tecnologias e Conceitos Utilizados
* **Linguagem:** Java (JDK 25+)
* **Conceitos OOP:** Herança, Polimorfismo, Encapsulamento, Sobrecarga e Sobrescrita de Métodos.
* **Bibliotecas Java:** `java.util.List`, `java.util.ArrayList`, `java.util.Scanner`, `java.text.SimpleDateFormat` e `java.util.Date`.
* **Tratamento de Dados:** Gestão de buffer do `Scanner` e formatação monetária/temporal (`String.format`).

---

## 💻 Exemplo de Execução

### **Entrada:**
```text
Enter the number of products: 3
Data #1 product:
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 260.00
Customs fee: 20.00

Data #2 product:
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 1100.00

Data #3 product:
Common, used or imported (c/u/i)? u
Name: Iphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2025
