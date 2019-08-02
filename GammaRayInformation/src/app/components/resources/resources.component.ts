import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { promise } from 'protractor';
import { resolve } from 'url';

@Component({
  selector: 'app-resources',
  templateUrl: './resources.component.html',
  styleUrls: ['./resources.component.css']
})
export class ResourcesComponent implements OnInit {
  url: string;
  searchValue: string;
  titleArticle1: string;
  link1: string;
  titleArticle2: string;
  link2: string;
  titleArticle3: string;
  link3: string;
  titleArticle4: string;
  link4: string;
  titleArticle5: string;
  link5: string;
  result: boolean = false;

  constructor(private http : HttpClient) { }

  ngOnInit() {
  }

  searchStackOverflow(){

    this.url = 'https://api.stackexchange.com/2.2/search?order=desc&sort=activity&intitle='+this.searchValue+'&site=stackoverflow'

    let promise = new Promise((resolve,reject)=>{
      this.http.get(this.url).
      toPromise().then(
        res =>{
          this.result = true;

          this.titleArticle1=res["items"][0]["title"]
          this.link1 = res["items"][0]["link"]
          
          this.titleArticle2=res["items"][1]["title"]
          this.link2 = res["items"][1]["link"]

          this.titleArticle3=res["items"][2]["title"]
          this.link3 = res["items"][2]["link"]

          this.titleArticle4=res["items"][3]["title"]
          this.link4 = res["items"][3]["link"]

          this.titleArticle5=res["items"][4]["title"]
          this.link5 = res["items"][4]["link"]
          resolve()
        }
      )
    }); 
  }
  

}
