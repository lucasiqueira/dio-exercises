## Angular
### Exercícios de Angular do curso de Desenvolvimento Web Full Stack do Bootcamp Santander da DIO.

Será utilizado o Angular no projeto na versão 14.1.2:
```
npm install -g @angular/cli@14.1.2
```
Obs: Não foi possível utilizar os comandos `ng` sem instalar o Angular CLI globalmente.

Extensões utilizadas no VSCode:
- Angular Language Service
- Auto Close Tag
- Auto Rename Tag

Muito simples utilizar o `ng` para manipular o projeto Angular.

#### Ciclo de Vida de Componentes no Angular:
- ngOnChanges: Quando o valor de um atributo de entrada é atualizado.
- ngOnInit: Quando o componente é inicializado.
- ngDoCheck: A cada ciclo de verificação de mudanças.
- ngAfterContentInit: Depois de inserir conteúdo externo na visualização.
- ngAfterContentChecked: A cada verificação de conteúdo inserido.
- ngAfterViewInit: Depois que a visualização do componente é inicializada.
- ngAfterViewChecked: A cada verificação de visualização.
- ngOnDestroy: Antes da instância do componente ser destruída.

#### Diretivas do Angular:
- ngFor: Itera sobre uma lista de itens.
- ngIf: Exibe um elemento se a condição for verdadeira.
- ngSwitch: Adiciona/Remove elementos DOM com base em uma condição.
- ngClass: Adiciona/Remove classes CSS com base em uma condição.
- ngStyle: Adiciona/Remove estilos CSS com base em uma condição.
- ngModel: Vincula um elemento de formulário a uma propriedade.
- ng-template: Trata-se de um elemento HTML que por padrão fica oculto, necessitando ser configurado para exibir.
- ng-container: Renderiza um elemento HTML sem adicionar nenhum elemento extra ao DOM.
- ng-content: Renderiza o conteúdo inserido em um componente.
