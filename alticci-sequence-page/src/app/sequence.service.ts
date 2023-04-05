import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SequenceService {

  private sequenceUrl = "alticci";

  constructor(
    private http: HttpClient
  ) { }

  getSequenceByIndex(index: Number): Observable<Number> {
    const url = `${environment.backendUrl}/${this.sequenceUrl}/${index}`

    return this.http.get<Number>(url);
  }
}
