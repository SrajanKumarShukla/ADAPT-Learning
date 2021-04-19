import { Component, OnInit } from '@angular/core';
import { FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private fb: FormBuilder) { }
  flightSearch =this.fb.group({
    departure:[''],
    arival:['']
  })
  ngOnInit(): void {
  }

}
