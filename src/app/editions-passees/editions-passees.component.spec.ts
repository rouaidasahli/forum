import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditionsPasseesComponent } from './editions-passees.component';

describe('EditionsPasseesComponent', () => {
  let component: EditionsPasseesComponent;
  let fixture: ComponentFixture<EditionsPasseesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EditionsPasseesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EditionsPasseesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
