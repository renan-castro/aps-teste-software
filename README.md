# 📚 Projeto Cadastro de Usuários

Este projeto contém uma implementação simples de cadastro de usuários em Java, utilizando `Set` para garantir unicidade, e cobertura de testes com **JaCoCo**.

---

## ✅ Pré-requisitos

- Java 11 ou superior
- Maven 3.x
- IntelliJ IDEA (opcional, para execução via interface)

---

## ⚙️ Execução dos testes com cobertura

### ▶️ **Via terminal (Maven)**

1. Execute os testes com geração do relatório de cobertura:

```bash
mvn clean test jacoco:report
```

2. Após a execução, o relatório será gerado em:
- target/site/jacoco/index.html

3. Abra o arquivo index.html no navegador para visualizar a cobertura detalhada do código.

### ▶️ **Via IntelliJ IDEA**
Clique com o botão direito sobre o diretório src/test/java ou sobre a classe de teste desejada.
Selecione Run '...Test' with Coverage.
O IntelliJ executará os testes e mostrará a cobertura diretamente no editor de código:
- Verde: linha coberta.
- Vermelha: linha não executada.
- Amarela: cobertura parcial (em estruturas condicionais).



