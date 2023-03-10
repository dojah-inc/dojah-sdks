/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetAccountAnalysisResponseEntityInflowBreakdown
    /// </summary>
    [DataContract(Name = "GetAccountAnalysisResponse_entity_inflowBreakdown")]
    public partial class GetAccountAnalysisResponseEntityInflowBreakdown : IEquatable<GetAccountAnalysisResponseEntityInflowBreakdown>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetAccountAnalysisResponseEntityInflowBreakdown" /> class.
        /// </summary>
        /// <param name="additionalIncome">additionalIncome.</param>
        /// <param name="recurringSalaryPayments">recurringSalaryPayments.</param>
        /// <param name="aSalaryEarner">aSalaryEarner.</param>
        /// <param name="averageAdditionalIncome">averageAdditionalIncome.</param>
        /// <param name="averageGuaranteedSalary">averageGuaranteedSalary.</param>
        /// <param name="estimatedSalaryPaymentDay">estimatedSalaryPaymentDay.</param>
        /// <param name="lastDateOfSalaryPayment">lastDateOfSalaryPayment.</param>
        /// <param name="minimumSalary">minimumSalary.</param>
        /// <param name="netAverageMonthlySalary">netAverageMonthlySalary.</param>
        /// <param name="numberOfAdditionalIncomePayments">numberOfAdditionalIncomePayments.</param>
        /// <param name="totalnumberOfSalaryPayments">totalnumberOfSalaryPayments.</param>
        public GetAccountAnalysisResponseEntityInflowBreakdown(string additionalIncome = default(string), string recurringSalaryPayments = default(string), string aSalaryEarner = default(string), decimal averageAdditionalIncome = default(decimal), decimal averageGuaranteedSalary = default(decimal), string estimatedSalaryPaymentDay = default(string), string lastDateOfSalaryPayment = default(string), decimal minimumSalary = default(decimal), decimal netAverageMonthlySalary = default(decimal), decimal numberOfAdditionalIncomePayments = default(decimal), decimal totalnumberOfSalaryPayments = default(decimal))
        {
            this.AdditionalIncome = additionalIncome;
            this.RecurringSalaryPayments = recurringSalaryPayments;
            this.ASalaryEarner = aSalaryEarner;
            this.AverageAdditionalIncome = averageAdditionalIncome;
            this.AverageGuaranteedSalary = averageGuaranteedSalary;
            this.EstimatedSalaryPaymentDay = estimatedSalaryPaymentDay;
            this.LastDateOfSalaryPayment = lastDateOfSalaryPayment;
            this.MinimumSalary = minimumSalary;
            this.NetAverageMonthlySalary = netAverageMonthlySalary;
            this.NumberOfAdditionalIncomePayments = numberOfAdditionalIncomePayments;
            this.TotalnumberOfSalaryPayments = totalnumberOfSalaryPayments;
        }

        /// <summary>
        /// Gets or Sets AdditionalIncome
        /// </summary>
        [DataMember(Name = "AdditionalIncome", EmitDefaultValue = false)]
        public string AdditionalIncome { get; set; }

        /// <summary>
        /// Gets or Sets RecurringSalaryPayments
        /// </summary>
        [DataMember(Name = "RecurringSalaryPayments", EmitDefaultValue = true)]
        public string RecurringSalaryPayments { get; set; }

        /// <summary>
        /// Gets or Sets ASalaryEarner
        /// </summary>
        [DataMember(Name = "aSalaryEarner", EmitDefaultValue = false)]
        public string ASalaryEarner { get; set; }

        /// <summary>
        /// Gets or Sets AverageAdditionalIncome
        /// </summary>
        [DataMember(Name = "averageAdditionalIncome", EmitDefaultValue = false)]
        public decimal AverageAdditionalIncome { get; set; }

        /// <summary>
        /// Gets or Sets AverageGuaranteedSalary
        /// </summary>
        [DataMember(Name = "averageGuaranteedSalary", EmitDefaultValue = false)]
        public decimal AverageGuaranteedSalary { get; set; }

        /// <summary>
        /// Gets or Sets EstimatedSalaryPaymentDay
        /// </summary>
        [DataMember(Name = "estimatedSalaryPaymentDay", EmitDefaultValue = true)]
        public string EstimatedSalaryPaymentDay { get; set; }

        /// <summary>
        /// Gets or Sets LastDateOfSalaryPayment
        /// </summary>
        [DataMember(Name = "lastDateOfSalaryPayment", EmitDefaultValue = true)]
        public string LastDateOfSalaryPayment { get; set; }

        /// <summary>
        /// Gets or Sets MinimumSalary
        /// </summary>
        [DataMember(Name = "minimumSalary", EmitDefaultValue = false)]
        public decimal MinimumSalary { get; set; }

        /// <summary>
        /// Gets or Sets NetAverageMonthlySalary
        /// </summary>
        [DataMember(Name = "netAverageMonthlySalary", EmitDefaultValue = false)]
        public decimal NetAverageMonthlySalary { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfAdditionalIncomePayments
        /// </summary>
        [DataMember(Name = "numberOfAdditionalIncomePayments", EmitDefaultValue = false)]
        public decimal NumberOfAdditionalIncomePayments { get; set; }

        /// <summary>
        /// Gets or Sets TotalnumberOfSalaryPayments
        /// </summary>
        [DataMember(Name = "totalnumberOfSalaryPayments", EmitDefaultValue = false)]
        public decimal TotalnumberOfSalaryPayments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetAccountAnalysisResponseEntityInflowBreakdown {\n");
            sb.Append("  AdditionalIncome: ").Append(AdditionalIncome).Append("\n");
            sb.Append("  RecurringSalaryPayments: ").Append(RecurringSalaryPayments).Append("\n");
            sb.Append("  ASalaryEarner: ").Append(ASalaryEarner).Append("\n");
            sb.Append("  AverageAdditionalIncome: ").Append(AverageAdditionalIncome).Append("\n");
            sb.Append("  AverageGuaranteedSalary: ").Append(AverageGuaranteedSalary).Append("\n");
            sb.Append("  EstimatedSalaryPaymentDay: ").Append(EstimatedSalaryPaymentDay).Append("\n");
            sb.Append("  LastDateOfSalaryPayment: ").Append(LastDateOfSalaryPayment).Append("\n");
            sb.Append("  MinimumSalary: ").Append(MinimumSalary).Append("\n");
            sb.Append("  NetAverageMonthlySalary: ").Append(NetAverageMonthlySalary).Append("\n");
            sb.Append("  NumberOfAdditionalIncomePayments: ").Append(NumberOfAdditionalIncomePayments).Append("\n");
            sb.Append("  TotalnumberOfSalaryPayments: ").Append(TotalnumberOfSalaryPayments).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetAccountAnalysisResponseEntityInflowBreakdown);
        }

        /// <summary>
        /// Returns true if GetAccountAnalysisResponseEntityInflowBreakdown instances are equal
        /// </summary>
        /// <param name="input">Instance of GetAccountAnalysisResponseEntityInflowBreakdown to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetAccountAnalysisResponseEntityInflowBreakdown input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AdditionalIncome == input.AdditionalIncome ||
                    (this.AdditionalIncome != null &&
                    this.AdditionalIncome.Equals(input.AdditionalIncome))
                ) && 
                (
                    this.RecurringSalaryPayments == input.RecurringSalaryPayments ||
                    (this.RecurringSalaryPayments != null &&
                    this.RecurringSalaryPayments.Equals(input.RecurringSalaryPayments))
                ) && 
                (
                    this.ASalaryEarner == input.ASalaryEarner ||
                    (this.ASalaryEarner != null &&
                    this.ASalaryEarner.Equals(input.ASalaryEarner))
                ) && 
                (
                    this.AverageAdditionalIncome == input.AverageAdditionalIncome ||
                    this.AverageAdditionalIncome.Equals(input.AverageAdditionalIncome)
                ) && 
                (
                    this.AverageGuaranteedSalary == input.AverageGuaranteedSalary ||
                    this.AverageGuaranteedSalary.Equals(input.AverageGuaranteedSalary)
                ) && 
                (
                    this.EstimatedSalaryPaymentDay == input.EstimatedSalaryPaymentDay ||
                    (this.EstimatedSalaryPaymentDay != null &&
                    this.EstimatedSalaryPaymentDay.Equals(input.EstimatedSalaryPaymentDay))
                ) && 
                (
                    this.LastDateOfSalaryPayment == input.LastDateOfSalaryPayment ||
                    (this.LastDateOfSalaryPayment != null &&
                    this.LastDateOfSalaryPayment.Equals(input.LastDateOfSalaryPayment))
                ) && 
                (
                    this.MinimumSalary == input.MinimumSalary ||
                    this.MinimumSalary.Equals(input.MinimumSalary)
                ) && 
                (
                    this.NetAverageMonthlySalary == input.NetAverageMonthlySalary ||
                    this.NetAverageMonthlySalary.Equals(input.NetAverageMonthlySalary)
                ) && 
                (
                    this.NumberOfAdditionalIncomePayments == input.NumberOfAdditionalIncomePayments ||
                    this.NumberOfAdditionalIncomePayments.Equals(input.NumberOfAdditionalIncomePayments)
                ) && 
                (
                    this.TotalnumberOfSalaryPayments == input.TotalnumberOfSalaryPayments ||
                    this.TotalnumberOfSalaryPayments.Equals(input.TotalnumberOfSalaryPayments)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AdditionalIncome != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalIncome.GetHashCode();
                }
                if (this.RecurringSalaryPayments != null)
                {
                    hashCode = (hashCode * 59) + this.RecurringSalaryPayments.GetHashCode();
                }
                if (this.ASalaryEarner != null)
                {
                    hashCode = (hashCode * 59) + this.ASalaryEarner.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AverageAdditionalIncome.GetHashCode();
                hashCode = (hashCode * 59) + this.AverageGuaranteedSalary.GetHashCode();
                if (this.EstimatedSalaryPaymentDay != null)
                {
                    hashCode = (hashCode * 59) + this.EstimatedSalaryPaymentDay.GetHashCode();
                }
                if (this.LastDateOfSalaryPayment != null)
                {
                    hashCode = (hashCode * 59) + this.LastDateOfSalaryPayment.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MinimumSalary.GetHashCode();
                hashCode = (hashCode * 59) + this.NetAverageMonthlySalary.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfAdditionalIncomePayments.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalnumberOfSalaryPayments.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}