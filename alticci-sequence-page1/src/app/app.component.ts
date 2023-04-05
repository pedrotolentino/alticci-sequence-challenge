import { Component } from '@angular/core';
import { SequenceService } from './sequence.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  titulo: String = 'Sequência de Alticci';
  indexSequence: Number = 0;
  result: Number | undefined;

  constructor(private sequenceService: SequenceService) {}

  getSequenceByIndex(index: Number): void {
    this.sequenceService.getSequenceByIndex(index)
      .subscribe(output => this.result = output);
  }
}
