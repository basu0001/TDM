import { Postrmldetails } from './../models/postrmldetails';

import { Injectable } from '@angular/core';
import { Http, Response } from "@angular/http";
import { Headers, RequestOptions } from '@angular/http';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { RestClientService } from './rest-client.service';
import { Terminal } from '../models/terminal';
import { Pos } from '../models/pos';
import { Terminalchar } from '../models/terminalchar';
import { Terminaltimings } from '../models/terminaltimings';


@Injectable({
  providedIn: 'root'
})

export class CommonService {

  displayUrl = "http://localhost:8080/join6";
  terminalUrl = "http://localhost:8080/terminals/create";
  terminalCharUrl = "http://localhost:8080/trmlapploc/create";
  terminalTimeUrl = "http://localhost:8080/terminaltiming/create"
  posTrmlDetailsUrl = "http://localhost:8080/postrmldetails/create"
  posTrmlUrl = "http://localhost:8080/posdetails/create";

  constructor(private restClient: RestClientService) {}

  private extractData(res: Response) {
    let data = res;
    return data || {};
  }

  getTerminals(): Observable < any > {
    return this.restClient.get(this.displayUrl).pipe(map(this.extractData));
  }

  createTerminalParam(terminalchar: Terminalchar): Observable < any > {
    console.log('createTerminal service called. Passing terminal to database');
    return this.restClient.post(this.terminalCharUrl, terminalchar, true);
  }

  createTerminalTime(terminaltime: Terminaltimings): Observable < any > {
    console.log('createTerminalTime service called. Passing terminal to database');
    return this.restClient.post(this.terminalTimeUrl, terminaltime, true);
  }

  createPosTrmlDetails(postrmldetails: Postrmldetails): Observable < any > {
    console.log('creatPosTrmlDetails service called. Passing terminal to database');
    return this.restClient.post(this.posTrmlDetailsUrl, postrmldetails, true);
  }

  createTerminal(terminal: Terminal): Observable < any > {
    console.log('createTerminalParam service called. Passing terminal to database');
    return this.restClient.post(this.terminalUrl, terminal, true);
  }

  createPosTerminal(posTerminal: Pos): Observable < any > {
    console.log('createPosTerminal service called. Passing terminal to database');
    return this.restClient.post(this.posTrmlUrl, posTerminal, true);
  }

  updateTerminal(id: Number, terminal: Terminal) {
    const updateUrl = `http://localhost:8080/terminals/update/${id}`;
    console.log(updateUrl);
    return this.restClient.put(updateUrl, terminal, true);
  }

  updatePosTrmlDetails(id: Number, posterminal: Postrmldetails) {
    const updateUrl = `http://localhost:8080/postrmldetails/${id}`;
    console.log(updateUrl);
    return this.restClient.put(updateUrl, posterminal, true);

  }
  updateTerminalParam(id: Number, terminalchar: Terminalchar) {
    const updateUrl = `http://localhost:8080/trmlapploc/${id}`;
    console.log(updateUrl);
    return this.restClient.put(updateUrl, terminalchar, true);

  }
}
