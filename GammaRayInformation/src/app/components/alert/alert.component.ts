import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';

import { AlertService } from 'src/app/services/alert.service';

//The alert component passes alert messages to the template 
//whenever a message is received from the alert service. It
//does this by subscribing to the alert service's getMessage()
//method which returns an Observable.

@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.css']
})
export class AlertComponent implements OnInit, OnDestroy {
  private subscription: Subscription;
  message: any;

  constructor(private alertService: AlertService) { }

  ngOnInit() {
    this.subscription = this.alertService.getAlert()
    .subscribe(message => {
      switch (message && message.type) {
        case 'success':
          message.cssClass = 'alert alert-success';
          break;
        case 'error':
          message.cssClass = 'alert alert-danger';
          break;
      }

      this.message = message;
    });
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }

}