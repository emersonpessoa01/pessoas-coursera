# Praticar tarefa avaliada por colega: Métodos de Acesso para Data

<p>O objetivo desse exercícios é praticar como os métodos de acesso não precisam necessariamente representar um atributo da classe.</p>

<p>Crie uma classe Pessoa que possui um atributo do tipo Date chamado dataDeNascimento, assim como seus respectivos métodos do acesso. Crie métodos de acesso chamados getIdade() e getSigno() que obtém essas informações do atributo dataDeNascimento.</p>

<p>Crie pelo menos 3 testes de unidade com pessoas com diferentes idades e signos. (sugestão: pegue datas de nascimento de amigos para fazer os testes)</p>

---

- Áries: 21 de março - 20 de abril

- Touro: 21 de abril - 20 de maio

- Gêmeos: 21 de maio - 20 de junho

- Câncer: 21 de junho - 21 de julho

- Leão: 22 de julho - 22 de agosto

- Virgem: 23 de agosto - 22 de setembro

- Libra: 23 de setembro - 22 de outubro

- Escorpião: 23 de outubro - 21 de novembro

- Sagitário: 22 de novembro - 21 de dezembro

- Capricórnio: 22 de dezembro - 20 de janeiro

- Aquário: 21 de Janeiro - 19 de fevereiro

- Peixes: 20 de fevereiro - 20 de março

<details>
<summary>Visão geral dos critérios de avaliação</summary>
<p>Serão verificados se os itens pedidos no enunciado foram cumpridos. Procure entregar um código organizado pois isso também será avaliado. </p>
</details>
<details>

<summary>Testes dependente do tempo</summary>
O<p>bserve que a funcionalidade que calcula a idade depende do tempo corrente. Como fazer um teste de unidade, se o seu resultado pode ser diferente daqui a algum tempo? Para isso, precisamos, de alguma forma, controlar o valor retornado quando pedimos o valor do momento corrente.</p>

<p>Crie uma classe chamada Relogio e nessa classe crie um método chamado agora(), que retorna o valor de System.currentTimeMillis(). Crie uma variável, que se o valor dela não for zero, seu valor deve ser retornado no método agora(). Se você utilizar a classe Relogio para obter o tempo, será possível nos testes fazer com que ele retorne sempre um valor fixo! </p>
</details>
