# Projeto MongoDB com Spring Boot

## Objetivo Geral

O projeto tem como objetivos principais:

- Compreender as principais diferenças entre paradigma orientado a documentos e relacional.
- Implementar operações de CRUD.
- Refletir sobre decisões de design para um banco de dados orientado a documentos.
- Implementar associações entre objetos, incluindo:
  - Objetos aninhados.
  - Referências.
- Realizar consultas com Spring Data e MongoRepository.
  
 ## Camadas Lógicas

- **`resource`**: Contém os controladores REST que expõem os endpoints da API.
- **`service`**: Contém a lógica de negócios e as regras de manipulação dos dados.
- **`repository`**: Contém as interfaces que estendem `JpaRepository` para operações de acesso a dados.

## Checklist das entidades

1. **Atributos Básicos**
   - Atributos necessários para a entidade.

2. **Associações**
   - Coleções para associações.

3. **Construtores**
   - Inclusão de um construtor padrão.
   - Construtor com argumentos.

4. **Getters e Setters**
   - Métodos `get` e `set` para todos os atributos.

5. **hashCode e equals**
   - Implementação do `hashCode` e `equals` no `id` da entidade.

6. **Serializable**
   - Implementação da interface `Serializable` com o valor padrão.
  
  ## Tratamento de Exceções

- **ObjectNotFoundException:** Para casos em que recursos solicitados pelo cliente não sejam encontrados no servidor.

## Referências

- Projeto desenvolvido no curso de Java do professor Nelio Alves - @devsuperior


