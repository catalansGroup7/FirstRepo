import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div style="text-align:center" class="content">
      <h1>
        Welcome to {{title}}!
      </h1>
      <h2>
        Github Jenkins Integration Attempt
      </h2>
    </div>
    <div style="text-align:center" class="content">
      <h3>
        The integration was successful and now we move on towards Hibernate
      </h3>
    </div>
    <div style="text-align: right" class="content">
      <h4>
        Presented by Team 7
      </h4>
    </div>
  `,
  styles: [
    `h1{
      font-family: verdana;
      color: red;
    }
    h2{
      font-family:verdana;
      color:red;
    }
    h3{
      font-family: sans-serif;
      color: blue;
    }
    h4{
      font-family: arial;
      color: black;
    }`
  ]
})
export class AppComponent {
  title = 'AngularPro';
}
