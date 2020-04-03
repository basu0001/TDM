
import { map } from 'rxjs/operators';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Router } from '@angular/router';
import { URLSearchParams } from 'url';

@Injectable()
export class RestClientService {
  baseUrlLocalAsset = `./assets/data`;
  baseUrl = `http://client-service-app.apos.in`;

  constructor(private httpClient: HttpClient, private router: Router) { }

  get(serviceName: string, params?: any, remote?: boolean): Observable<any> {

     //setting the remote to true as it is appending .json unnecessarily
     remote=true;

    console.log('GET called ===>', { service: serviceName, remote: remote });
    // const base = remote ? this.baseUrl : this.baseUrlLocalAsset;
    // console.log('GETting base===>', base);
    const service = remote ? serviceName : serviceName;
    console.log('GETting service===>', service);
    const url = `${service}${remote ? '' : '.json'}`; // + ;
   
    console.log('GETting resource===>', url);
    return this.httpClient.get<any>(url, { params: params }).pipe(
      map(resp => {
        // console.log('resp===>', resp);
        return resp;
      }));
  }

  post(serviceName: string, params?: any, remote?: boolean): Observable<any> {
    if (!remote) {
      return this.get(serviceName, params, remote);
    }
    console.log('POST called ===>', { service: serviceName, remote: remote });
    // const base = remote ? this.baseUrl : this.baseUrlLocalAsset;
    // console.log('POSTting base===>', base);
    const service = remote ? serviceName : serviceName;
    console.log('POSTting service===>', service);
    const url = `${service}${remote ? '' : '.json'}`; // + ;

    console.log('POSTting resource===>', url);
    return this.httpClient.post<any>(url, params).pipe(
      map(resp => {
        // console.log('resp===>', resp);
        return resp;
      }));
  }
 
  put(serviceName: string,params: any , remote: boolean){

    let httpHeaders = new HttpHeaders().set('Content-Type','application/json');
        let options = { headers:httpHeaders};
    console.log('PUTting service===>', serviceName);
    return this.httpClient.put<any>(serviceName,JSON.stringify(params),options).pipe(
      map(resp => {
         console.log('resp===> in rest client', resp);
      }));

  }
}
